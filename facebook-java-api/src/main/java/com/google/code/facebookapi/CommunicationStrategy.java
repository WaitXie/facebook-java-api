package com.google.code.facebookapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

/**
 * Interface for encapsulating network communication logic. 
 */
public interface CommunicationStrategy {

	/**
	 * Sends a post request to the specified URL.
	 * @param serverUrl Target server URL.
	 * @param params Parameters to include in POST body.
	 * @return String response.
	 * @throws IOException Thrown on any communication-related error.
	 */
	String sendPostRequest(URL serverUrl, Map<String, String> params) throws IOException;
	
	/**
	 * Helper function for posting a request that includes raw file data, such as file upload.
	 * 
	 * @param serverUrl Target server URL.
	 * @param methodName the name of the method
	 * @param params request parameters (not including the file)
	 * @return an InputStream with the request response
	 */
	String postFileRequest( URL serverUrl, IFacebookMethod method, Map<String,String> params, String fileName, InputStream fileStream ) throws IOException;
}

