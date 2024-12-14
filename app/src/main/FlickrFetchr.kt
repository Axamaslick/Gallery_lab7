private const val TAG = "FlickrFetchr"
class FlickrFetchr {
    private val flickrApi: FlickrApi
    init {
        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://www.flickr.com/").addConverterFactory(ScalarsConverterFactory.create()).build()
        flickrApi = retrofit.create(FlickrApi::class.java)
    }
}
