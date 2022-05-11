package logging;

public interface ILoggerManager {

	public void LogError(String message);
	public void LogInfo(String message) ;
	public void LogDebug(String message) ;
	public void LogWarning(String message) ;
}
