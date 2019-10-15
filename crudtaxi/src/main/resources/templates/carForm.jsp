<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CRUD MENU</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
        body {
            color: #566787;
            background: #f7f5f2;
            font-family: 'Roboto', sans-serif;
        }

        .table-wrapper {
            background: #fff;
            padding: 20px 25px;
            margin: 30px auto;
            border-radius: 3px;
            box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
        }

        .table-title {
            color: #fff;
            background: #40b2cd;
            padding: 16px 25px;
            margin: -20px -25px 10px;
            border-radius: 3px 3px 0 0;
        }

        .table-title h2 {
            margin: 5px 0 0;
            font-size: 24px;
        }

        .search-box {
            position: relative;
            float: right;
        }

        .search-box .input-group {
            min-width: 300px;
            position: absolute;
            right: 0;
        }

        .search-box .input-group-addon, .search-box input {
            border-color: #ddd;
            border-radius: 0;
        }

        .search-box input {
            height: 34px;
            padding-right: 35px;
            background: #f4fcfd;
            border: none;
            border-radius: 2px !important;
        }

        .search-box input:focus {
            background: #fff;
        }

        .search-box input::placeholder {
            font-style: italic;
        }

        .search-box .input-group-addon {
            min-width: 35px;
            border: none;
            background: transparent;
            position: absolute;
            right: 0;
            z-index: 9;
            padding: 6px 0;
        }

        .search-box i {
            color: #a0a5b1;
            font-size: 19px;
            position: relative;
            top: 2px;
        }

        table.table {
            table-layout: fixed;
            margin-top: 15px;
        }

        table.table tr th, table.table tr td {
            border-color: #e9e9e9;
        }

        table.table th i {
            font-size: 13px;
            margin: 0 5px;
            cursor: pointer;
        }

        table.table th:first-child {
            width: 60px;
        }

        table.table th:last-child {
            width: 120px;
        }

        table.table td a {
            color: #a0a5b1;
            display: inline-block;
            margin: 0 5px;
        }

        table.table td a.view {
            color: #03A9F4;
        }

        table.table td a.edit {
            color: #FFC107;
        }

        table.table td a.delete {
            color: #E34724;
        }

        table.table td i {
            font-size: 19px;
        }

        .example_b {
            color: #fff !important;
            text-transform: uppercase;
            text-decoration: none;
            background: #60a3bc;
            padding: 20px;
            border-radius: 50px;
            display: inline-block;
            border: none;
            transition: all 0.4s ease 0s;
        }
        .example_b:hover {
            text-shadow: 0px 0px 6px rgba(255, 255, 255, 1);
            -webkit-box-shadow: 0px 5px 40px -10px rgba(0,0,0,0.57);
            -moz-box-shadow: 0px 5px 40px -10px rgba(0,0,0,0.57);
            transition: all 0.4s ease 0s;
        }

    </style>

    <script type="text/javascript">
        $(document).ready(function () {
            // Activate tooltips
            $('[data-toggle="tooltip"]').tooltip();

            // Filter table rows based on searched term
            $("#search").on("keyup", function () {
                var term = $(this).val().toLowerCase();
                $("table tbody tr").each(function () {
                    $row = $(this);
                    var name = $row.find("td:nth-child(2)").text().toLowerCase();
                    console.log(name);
                    if (name.search(term) < 0) {
                        $row.hide();
                    } else {
                        $row.show();
                    }
                });
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="table-wrapper">
        <div class="table-title">
            <div class="row">
                <div class="col-sm-6">
                    <h2>Car<b> Manage</b></h2>
                </div>
                <div class="col-sm-6">
                    <div class="search-box">
                        <div class="input-group">
                            <input type="text" id="search" class="form-control" placeholder="Search by Car Number">
                            <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        ID:
        <input type="text" name="carID" value="" style="border-radius: 1px; margin-left: 142px; padding: 1.5%;"> &emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        CAR NUMBER :
        <input type="text" name="carNo" value="" style="border-radius: 1px; margin-left: 60px; padding: 1.5%;"><br> <br>
        LICENSE PLATE   :
        <input type="text" name="license_plate" value="" style="border-radius: 1px; margin-left: 52px; padding: 1.5%;">&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        SEAT COUNT :
        <input type="text" name="seat_count" value="" style="border-radius: 1px; margin-left: 68px; padding: 1.5%;"><br> <br>
        RATING:
        <input type="text" name="rating" value=""style="border-radius: 1px; margin-left: 106px; padding: 1.5%;">&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        ENERGY TYPE:
        <input type="text" name="energy_type" value=""style="border-radius: 1px; margin-left: 64px; padding: 1.5%;"><br><br>
        MENU FACTURE ID:
        <input type="text" name="mfID" value=""style="border-radius: 1px; margin-left: 36px; padding: 1.5%;">&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        DRIVER ID:
        <input type="text" name="driverID" value="" style="border-radius: 1px; margin-left: 90px; padding: 1.5%;"> <br> <br>    <br>

        <div class="button_cont" align="margin-left"> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; <a class="example_b" href="" target="_blank" rel="nofollow noopener" >Add New Car</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            <a class="example_b" href="" target="_blank" rel="nofollow noopener">Update</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;


            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>carNo</th>
                    <th>license_plate</th>
                    <th>seat_count</th>
                    <th>rating</th>
                    <th>energy_type</th>
                    <th>mfID</th>
                    <th>driverID</th>
                </tr>
                </thead>
                <body>
                <tr>
                    <td>1</td>
                    <td>A3</td>
                    <td>1234.</td>
                    <td>9</td>
                    <td>5</td>
                    <td>Xang</td>
                    <td>1</td>
                    <td>2</td>
                    <td>
                        <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i
                                class="material-icons">&#xE254;</i></a>
                        <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i
                                class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>A4</td>
                    <td>7777</td>
                    <td>12</td>
                    <td>5</td>
                    <td>Dau</td>
                    <td>2</td>
                    <td>3</td>
                    <td>
                        <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i
                                class="material-icons">&#xE254;</i></a>
                        <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i
                                class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>A4</td>
                    <td>1111</td>
                    <td>2</td>
                    <td>4</td>
                    <td>Xang</td>
                    <td>9</td>
                    <td>10</td>
                    <td>
                        <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i
                                class="material-icons">&#xE254;</i></a>
                        <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i
                                class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>A6</td>
                    <td>8888</td>
                    <td>4</td>
                    <td>10</td>
                    <td>Xang</td>
                    <td>11</td>
                    <td>20</td>
                    <td>
                        <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i
                                class="material-icons">&#xE254;</i></a>
                        <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i
                                class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>A10</td>
                    <td>9999</td>
                    <td>4</td>
                    <td>100</td>
                    <td>Xang</td>
                    <td>20</td>
                    <td>21</td>
                    <td>
                        <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i
                                class="material-icons">&#xE254;</i></a>
                        <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i
                                class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>


                </body>

            </table>




            </table>



</body>
</html>