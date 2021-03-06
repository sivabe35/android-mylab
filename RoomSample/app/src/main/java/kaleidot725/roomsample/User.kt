package kaleidot725.roomsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
    @Ignore val age: String?
) {
    constructor(id: Int, firstName: String?, lastName: String) : this(id, firstName, lastName, null)
}