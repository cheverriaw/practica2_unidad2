/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class ClientVideoClubServiceTest extends TestCase{
    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;
    
    public ClientVideoClubServiceTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception{
        super.setUp();
        Video28Mock = EasyMock.createMock(IVideo.class);
        remoteVideoClubServiceMock = EasyMock.createMock(IVideoClubService.class);
    }
    
    protected void tearDown() throws Exception{
        super.tearDown();
    }
    
    @Test
    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

    /**
     * Test of getVideo method, of class ClientVideoClubService.
     */
    @Test
    public void testGetVideo() throws Exception{
        
    }
    
}
