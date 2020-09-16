import fi.iki.elonen.NanoHTTPD;
//import fi.iki.elonen.NanoHTTPD.IHTTPSession;
//import fi.iki.elonen.NanoHTTPD.Response;
import java.io.IOException;

public class ServerEstatico extends NanoHTTPD{

    public ServerEstatico() throws IOException{
        super(9000);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }

    @Override
    public Response serve(IHTTPSession session){
        return newFixedLengthResponse("Hello world");
    }
    
}
