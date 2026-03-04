import androidx.room.*

@Dao
interface DocumentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(document: DocumentEntity)

    @Query("SELECT * FROM documents ORDER BY createdAt DESC")
    suspend fun getAll(): List<DocumentEntity>

    @Query("DELETE FROM documents WHERE id = :id")
    suspend fun delete(id: String)
}
