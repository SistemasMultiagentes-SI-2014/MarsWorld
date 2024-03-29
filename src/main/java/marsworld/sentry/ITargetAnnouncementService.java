package marsworld.sentry;

import jadex.bridge.service.annotation.Reference;
import jadex.commons.future.IFuture;
import jadex.extension.envsupport.environment.ISpaceObject;

/**
 *
 */
public interface ITargetAnnouncementService {

    /**
     *
     */
    public IFuture<Void> announceNewTarget(@Reference ISpaceObject target);
}
