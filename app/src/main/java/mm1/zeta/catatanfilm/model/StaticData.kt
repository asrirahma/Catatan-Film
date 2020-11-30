package mm1.zeta.catatanfilm.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class StaticResponse(
    val data: List<StaticData>? = null
)

@Parcelize
data class StaticData(
    val image: Int? = null,
    val name: String? = null,
    val id: Int? = null,
    val sinopsis: String? = null,
    val rating: String? = null,
    val youtube: String? = null,
    val genre: String? = null
): Parcelable