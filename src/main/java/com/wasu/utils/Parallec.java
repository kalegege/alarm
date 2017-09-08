package com.wasu.utils;

import io.parallec.core.*;
import io.parallec.core.bean.ping.PingMode;
import io.parallec.core.util.PcDateUtils;
import io.parallec.core.util.PcStringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kale on 2017/8/8.
 */
public class Parallec {
    public static void main(String[] args) {
        pings();
//        ping2();
//        tcp();
    }

    public static void pings() {
        ParallelClient pc = new ParallelClient();
        ParallelTask task = pc.preparePing()
                .setConcurrency(1500)
                .setTargetHostsFromString("www.baidu2.com 182.16.29.139 127.0.0.1")
//                .setTargetHostsFromLineByLineText("http://www.parallec.io/userdata/sample_target_hosts_top100_old.txt",
//                        HostsSourceType.URL)
                .setPingMode(PingMode.INET_ADDRESS_REACHABLE_NEED_ROOT)
                .setPingNumRetries(1)
                .setPingTimeoutMillis(200).execute(new ParallecResponseHandler() {

                    public void onCompleted(ResponseOnSingleTask res, Map<String, Object> responseContext) {
                        System.out.println(res.toString());

//                Map<String, Object> metricMap = new HashMap<String, Object>();
//                metricMap.put("StatusCode", res.getStatusCode().replaceAll(" ", "_"));
//                metricMap.put("host", res.getHost());
//                metricMap.put("receiveTIme", res.getReceiveTime());
//                System.out.println("StatusCode:" + res.getStatusCode().replaceAll(" ", "_"));
//                System.out.println("host" + res.getHost());
//                System.out.println("receiveTIme" + res.getReceiveTime());

//                metricMap.put("LastUpdated", PcDateUtils.getNowDateTimeStrStandard());
//                metricMap.put("NodeGroupType", "Web100");
//                Client client = (Client) responseContext.get("Client");
//                client.prepareIndex("local", "parallec", res.getHost()).setSource(metricMap).execute();
                    }
                });

        while (!task.isCompleted()) {
            try {
                Thread.sleep(100L);
                System.out.println(String.format(
                        "POLL_JOB_PROGRESS (%.5g%%)  PT jobid: %s",
                        task.getProgress(), task.getTaskId()));
                pc.logHealth();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Result Summary\n " + PcStringUtils.renderJson(task.getAggregateResultFullSummary()));

        System.out.println("Result Brief Summary\n " + PcStringUtils.renderJson(task.getAggregateResultCountSummary()));

//        String dd="2";
//        System.out.println(dd.indexOf('2'));
//        System.out.println(dd.indexOf(2));


        System.out.println("Result Full Summary\n " + PcStringUtils.renderJson(task.getParallelTaskResult()));

        pc.releaseExternalResources();

//        System.out.println("Task Pretty Print: \n" +
//                PcStringUtils.renderJson(task.getAggregateResultCountSummary()));
//        System.out.println("Total Duration: " + task.getDurationSec());
//        pc.releaseExternalResources();
    }

    public static void tcp() {
        ParallelClient pc = new ParallelClient();
        ParallelTask task = pc.prepareTcp("requestMonitor")
                .setTargetHostsFromString("localhost")
                .setTcpPort(10081)
                .execute(new ParallecResponseHandler() {
                    public void onCompleted(ResponseOnSingleTask res,
                                            Map<String, Object> responseContext) {
                        System.out.println("Responose:" + res.getResponseContent() + " host: "
                                + res.getHost() + " errmsg: "
                                + res.getErrorMessage());
                    }
                });
//        System.out.println("Result Full Summary\n " + PcStringUtils.renderJson(task.getParallelTaskResult()));

        System.out.println("Result Summary\n " + PcStringUtils.renderJson(task.getAggregateResultFullSummary()));

        System.out.println("Result Brief Summary\n " + PcStringUtils.renderJson(task.getAggregateResultCountSummary()));


        pc.releaseExternalResources();

//        System.out.println("Result Full Summary\n " + PcStringUtils.renderJson(task.getParallelTaskResult()));

    }

    public static void ping1() {
        String host = "182.16.29.139";
        int timeOut = 3000; //超时应该在3钞以上
        try {
            boolean status = InetAddress.getByName(host).isReachable(timeOut);
            System.out.println(host + "status:" + status);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ping2() {
        System.out.println("开始ping");
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec("ping 127.0.0.1 -c 4");
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
                System.out.println(line);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
