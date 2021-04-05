
package videoclub;

/**
 *
 * @author william
 */
public class ClientVideoClubService implements IVideoClubService {
    private IVideoClubService remoteVideoClubService;
    
    public ClientVideoClubService(IVideoClubService remoteVideoClubService) {
        if (remoteVideoClubService == null) {
            throw new IllegalArgumentException("'remoteVideoClubService' must not be null");
            }
        this.remoteVideoClubService = remoteVideoClubService;
    }
    
    public IVideo getVideo(int VideoNumber) {
        return remoteVideoClubService.getVideo(VideoNumber);
    }
    
}
