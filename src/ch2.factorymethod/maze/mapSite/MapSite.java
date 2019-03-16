package maze.mapSite;

public interface MapSite {
	void enter();

	// for "prototype pattern"
	MapSite clone();
}
