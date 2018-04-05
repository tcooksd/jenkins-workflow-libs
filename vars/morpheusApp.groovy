import org.tadamhicks.JenkinsHttpClient

def buildApp(String morpheusUrl, Map<?, ?> postBody, String bearerToken) {
	JenkinsHttClient http = new JenkinsHttpClient()
	http.postJson(morpheusUrl, postBody, bearerToken)
}
