package songs;

public class SongTest {
	
	public static void main(String[] args) {
		Songs s = new Songs();
		
		s.setTitle("좋은날");
		s.setArtist("아이유");
		s.setAlbum("Real");
		s.setComposer("이민수");
		s.setTrack(3);
		s.setYear(2010);
		
		Songs song=new Songs("좋은날","아이유","Real","이민수",2010,3);
		Songs song2 = new Songs( "러빙유", "씨스타", "", null, 0, 0 );
	    Songs song3 = new Songs( "여수 밤바다", "버스커 버스커", "", null, 0, 0 ); 
	    Songs song4 = new Songs( "Like This", "원더걸스" );  

		s.show();
		song.show();
		song2.show();
		song3.show();
		song4.show();
	}
	
}
