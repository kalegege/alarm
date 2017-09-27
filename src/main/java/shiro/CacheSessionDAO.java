package shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.SessionDAO;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by kale on 2017/9/27.
 */
public class CacheSessionDAO implements SessionDAO {
    @Override
    public Serializable create(Session session) {
        return null;
    }

    @Override
    public Session readSession(Serializable serializable) throws UnknownSessionException {
        return null;
    }

    @Override
    public void update(Session session) throws UnknownSessionException {

    }

    @Override
    public void delete(Session session) {

    }

    @Override
    public Collection<Session> getActiveSessions() {
        return null;
    }
}
