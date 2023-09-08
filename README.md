# TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN
Hasil Test Java CRUD Sulaeman menggunakan Thymeleaf dan Database MySQL 

## HASIL TAMPILAN
Berikut ini adalah tampilan dari CRUD Yang telah Saya Kerjakan untuk proses Test Java

# Simpan Movie
    Method : POST
    Endpoint : http://localhost:8080/showMovieCollectionForm
  Tampilan
  ![simpan_data](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/042d79c0-33cc-49ec-b581-46f3bc2ac53e)

# List Data Simpan
    Method : GET
    Endpoint : http://localhost:8080
  Tampilan
  ![data_simpan](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/95ce8ee7-b059-476b-b2aa-149cc6e16371)

# Update Movie
    Method : POST
    Endpoint : http://localhost:8080/showFormUpdateMovie/{id}
  Tampilan
  ![update_data](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/0b70cb19-a835-4264-b661-f104ab0cfe12)

# List Data Update
    Method : GET
    Endpoint : http://localhost:8080
  Tampilan
  ![data_update](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/cb6f38c7-8fde-4922-a393-74854146b5a5)

# Search Data Berdasarkan Title
     Method : GET
     Endpoint : http://localhost:8080/search?title=#{title}
  Tampilan
  ![Screenshot 2023-09-08 091215](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/a3a84c3b-8184-40ee-8683-dbca20465266)

# Delete Movie
    Method : GET
    Endpoint : http://localhost:8080/deleteMovie/{id}
  Tampilan
  ![data_delete](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/29017c95-a69f-4390-ac3f-c71a520e9e9c)


# Error Yang Terjadi jika data update dan simpan ada yang kosong atau null
 - Tampilan Error Saat Simpan Data
![error_data](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/fadff55c-a1a3-461a-bae1-7a7349acfb22)
 - Tampilan Error Saat Update Data
![Screenshot 2023-09-08 092017](https://github.com/mohammadsulaeman/TEST_JAVA_CRUD_MOHAMMAD_SULAEMAN/assets/68136244/3ae39fba-b51a-4493-8a35-1213ef1a728b)
