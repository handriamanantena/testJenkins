package caller;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SendFail {

    String random;
    String random2;
}
