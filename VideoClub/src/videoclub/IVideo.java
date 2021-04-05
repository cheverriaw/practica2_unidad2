
package videoclub;

import java.io.InputStream;

/**
 *
 * @author william
 */
public interface IVideo {
    int getNumber();
    String getTitle();
    InputStream getDataAsStream();
}
