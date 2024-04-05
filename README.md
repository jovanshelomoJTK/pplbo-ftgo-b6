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
        <td>{
  "consumerId": 3,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T15:55:50.080Z",
  "lineItems": [
    {
      "menuItemId": "1",
      "quantity": 0
    }
  ],
  "restaurantId": 3
}</td>
        <td>{
  "orderId": 12
}</td>
        <td>FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>2</td>
        <td>Melakukan Order dengan tidak memilih menu apapun</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 3,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T15:55:50.080Z",
  "lineItems": [],
  "restaurantId": 3
}</td>
        <td>{
  "orderId": 13
}</td>
        <td>FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>3</td>
        <td>Melakukan Revise Order dengan quantity < 1 saat Order ID sudah terdaftar dan Menu ID sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId=3,
            request={
  "revisedOrderLineItems": [
    {
      "menuItemId": "1",
      "quantity": 0
    }
  ]
}
        </td>
        <td>{
  "orderId": 3,
  "state": "APPROVED",
  "orderTotal": "1000.00"
}</td>
        <td>FAIL (orderTotal masih tetap, belum jadi 0 saat ditampilkan output operasi revise)</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>4</td>
        <td>Melakukan Revise Order dengan quantity < 1 saat Order ID sudah terdaftar dan Menu ID tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan menjadi pengganti belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td> orderId=4,
        request = {
  "revisedOrderLineItems": [
    {
      "menuItemId": "4",
      "quantity": 0
    }
  ]
}</td>
        <td>{
  "orderId": 4,
  "state": "APPROVED",
  "orderTotal": "0.00"
}</td>
        <td>FAIL (karena tidak ada menu dengan ID = 4)</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>5</td>
        <td>Melakukan Revise Order dengan quantity = 2 saat Order ID sudah terdaftar dan Menu ID sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId = 5,
        request = {
  "revisedOrderLineItems": [
    {
      "menuItemId": "3",
      "quantity": 2
    }
  ]
}
        </td>
        <td>{
  "orderId": 5,
  "state": "APPROVAL_PENDING",
  "orderTotal": "12000.00"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>6</td>
        <td>Melakukan Revise Order dengan quantity = 2 saat Order ID sudah terdaftar dan Menu ID tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan menjadi pengganti belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId=7
         request={
  "revisedOrderLineItems": [
    {
      "menuItemId": "100",
      "quantity": 2
    }
  ]
}</td>
        <td>{
  "orderId": 7,
  "state": "APPROVAL_PENDING",
  "orderTotal": "30000.00"
}</td>
        <td>FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>7</td>
        <td>Melakukan Revise Order tanpa mengisi pilihan substitusi menu baru</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId=10,
        request = {
  "revisedOrderLineItems": []
}</td>
        <td>{
  "orderId": 10,
  "state": "APPROVAL_PENDING",
  "orderTotal": "30000.00"
}</td>
        <td>FAIL</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>8</td>
        <td>Melakukan Order dengan memilih Menu ID yang tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan dipesan belum terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 3,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T15:55:50.080Z",
  "lineItems": [
    {
      "menuItemId": "5",
      "quantity": 3
    }
  ],
  "restaurantId": 3
}</td>
        <td>{
  "timestamp": "2024-04-05T16:07:21.096+0000",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Invalid menu item id 5",
  "path": "/orders"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>9</td>
        <td>Melakukan Order dengan memilih Menu ID yang sudah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu yang akan dipesan sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 3,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T15:55:50.080Z",
  "lineItems": [
    {
      "menuItemId": "2",
      "quantity": 3
    }
  ],
  "restaurantId": 3
}</td>
        <td>{
  "orderId": 14
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>10</td>
        <td>Melakukan Order dengan memilih Restaurant ID yang tidak terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran yang akan dipesan belum terdaftar. Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 3,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T15:55:50.080Z",
  "lineItems": [
    {
      "menuItemId": "1",
      "quantity": 3
    }
  ],
  "restaurantId": 6
}</td>
        <td>{
  "timestamp": "2024-04-05T16:08:24.747+0000",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Restaurant not found with id 6",
  "path": "/orders"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>11</td>
        <td>Melakukan Order dengan memilih Restaurant ID yang terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran yang akan dipesan sudah terdaftar. Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 1,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T16:23:19.165Z",
  "lineItems": [
    {
      "menuItemId": "1",
      "quantity": 2
    }
  ],
  "restaurantId": 1
}</td>
        <td>{
  "orderId": 1
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>12</td>
        <td>Melakukan Order dengan Account dengan Consumer ID yang tidak valid (terdaftar?)</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan belum terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 2,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T16:23:19.165Z",
  "lineItems": [
    {
      "menuItemId": "1",
      "quantity": 2
    }
  ],
  "restaurantId": 1
}</td>
        <td>{
  "orderId": 2
}</td>
        <td>PASS (state: REJECTED)</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>13 (sama kyk TC-11) </td>
        <td>Melakukan Order dengan Account dengan Consumer ID yang terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order.</td>
        <td>{
  "consumerId": 1,
  "deliveryAddress": {
    "city": "AAAA",
    "state": "string",
    "street1": "BBB",
    "street2": "CCCC",
    "zip": "45555"
  },
  "deliveryTime": "2024-04-05T16:23:19.165Z",
  "lineItems": [
    {
      "menuItemId": "1",
      "quantity": 2
    }
  ],
  "restaurantId": 1
}</td>
        <td>{
  "orderId": 1
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>14</td>
        <td>Mendapatkan data order yang sudah didaftarkan Order ID nya</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId=1</td>
        <td>{
  "orderId": 1,
  "state": "APPROVED",
  "orderTotal": "2000.00"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>15</td>
        <td>Mendapatkan data order yang belum terdaftar Order ID nya</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer belum melakukan order. Order yang diminta belum tercatat ID-nya di dalam sistem.</td>
        <td>orderId=3</td>
        <td>Code 404 Error</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>16</td>
        <td>Melakukan Cancel Order dengan Order ID yang telah terdaftar</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem.</td>
        <td>orderId=1</td>
        <td>{
  "orderId": 1,
  "state": "APPROVED",
  "orderTotal": "2000.00"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
    <tr>
        <td>17</td>
        <td>Mendapatkan data order dengan Order ID yang sudah di-cancell</td>
        <td>Pengguna sudah dapat mengakses halaman Swagger, Daftar Restauran sudah terdaftar, Daftar Menu sudah terdaftar. Consumer yang melakukan pemesanan sudah terdaftar. Consumer sudah melakukan order. Order sebelumnya telah tercatat dalam sistem. Order sebelumnya telah di-cancell.</td>
        <td>orderId=1</td>
        <td>{
  "orderId": 1,
  "state": "CANCELLED",
  "orderTotal": "2000.00"
}</td>
        <td>PASS</td>
        <td>2024-05-04</td>
    </tr>
</table>

## Detail perubahan source code

[Untuk Bug fix terkait jumlah quantity yang dipesan < 1, berikut adalah commit terkait](https://github.com/jovanshelomoJTK/pplbo-ftgo-b6/commit/d97828850efa3bb4a385893bf158fedfbdf6ed8e)

[Untuk Bug fix terkait array kosong saat melakukan revise order ataupun create order, berikut adalah commit terkait](https://github.com/jovanshelomoJTK/pplbo-ftgo-b6/commit/5897d6b72604f73e7a172fb993c2ec6255297c81)
