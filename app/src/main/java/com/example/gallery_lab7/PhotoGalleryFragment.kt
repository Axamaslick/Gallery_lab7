package com.example.gallery_lab7


class PhotoGalleryFragment : Fragment() {
    private lateinit var photoRecyclerView:
            RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view =
            inflater.inflate(R.layout.fragment_photo_galler
                    y, container, false)
        photoRecyclerView =
            view.findViewById(R.id.photo_recycler_view)
        photoRecyclerView.layoutManager =
            GridLayoutManager(context, 3)
        return view
    }
    companion object {
        fun newInstance() =
            PhotoGalleryFragment()
    }
}