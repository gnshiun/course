rem Attribute VB_Name = "Module1"

Function show_line_number()
    
    n = Range("A1048576").End(xlUp).Row + 1
    show_line_number = n
    
End Function

Sub show_sheet_rows()

    Lines = Rows.Count
    Debug.Print Lines
    
End Sub

Sub method_1()

    If Rows.Count = 1048576 Then
        n = Range("A1048576").End(xlUp).Row + 1
    Else
        n = Range("A65536").End(xlUp).Row + 1
    End If
    
    Debug.Print n
    
End Sub

Sub set_var()

    Dim x As Integer
    Dim obj As Range
    
    x = 123
    Set obj = Cells(1, 2)
        
End Sub

Sub method_2()

    Dim obj As Range  '工作表的列
    
    If Rows.Count = 1048576 Then
        Set obj = Range("A1048576")
    Else
        Set obj = Range("A65536")
    End If
    
    n = obj.End(xlUp).Row + 1
    Debug.Print n
    
End Sub
