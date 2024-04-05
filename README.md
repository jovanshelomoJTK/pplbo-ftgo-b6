### Kelompok 6 - 3B D4

# Table for test case of FTGO
<table>
    <tr>
        <th>TC ID</th>
        <th>Test Case Name</th>
        <th>Precondition</th>
        <th>Test Data</th>
        <th>Actual Result</th>
        <th>Test Status</th>
        <th>Date Tested</th>
    </tr>
    <tr>
        <td>1</td>
        <td>Melakukan Order dengan qty < 1</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>2</td>
        <td>Melakukan Order dengan tidak memilih menu apapun</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>3</td>
        <td>Melakukan Revise Order dengan quantity < 1 saat Order ID sudah terdaftar dan Menu ID sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>4</td>
        <td>Melakukan Revise Order dengan quantity < 1 saat Order ID sudah terdaftar dan Menu ID tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan menjadi pengganti belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>5</td>
        <td>Melakukan Revise Order dengan quantity = 2 saat Order ID sudah terdaftar dan Menu ID sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>6</td>
        <td>Melakukan Revise Order dengan quantity = 2 saat Order ID sudah terdaftar dan Menu ID tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan menjadi pengganti belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>7</td>
        <td>Melakukan Revise Order tanpa mengisi pilihan substitusi menu baru</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>8</td>
        <td>Melakukan Order dengan memilih Menu ID yang tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan dipesan belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>9</td>
        <td>Melakukan Order dengan memilih Menu ID yang sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan dipesan sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>10</td>
        <td>Melakukan Order dengan memilih Restaurant ID yang tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran yang akan dipesan belum terdaftar. Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>11</td>
        <td>Melakukan Order dengan memilih Restaurant ID yang terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran yang akan dipesan sudah terdaftar. Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>12</td>
        <td>Melakukan Order dengan Account dengan Consumer ID yang tidak valid (terdaftar?)</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan belum terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>13</td>
        <td>Melakukan Order dengan Account dengan Consumer ID yang terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>14</td>
        <td>Mendapatkan data order yang sudah didaftarkan Order ID nya</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>15</td>
        <td>Mendapatkan data order yang belum terdaftar Order ID nya</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order. Order yang diminta belum tercatat ID-nya di dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>16</td>
        <td>Melakukan Cancel Order dengan Order ID yang telah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>test-data</td>
        <td>actual-result</td>
        <td>PASS/FAIL</td>
        <td>2024-05-04</td>
    </tr>
</table>
