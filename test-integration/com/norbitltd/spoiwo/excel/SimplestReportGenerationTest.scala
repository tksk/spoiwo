package com.norbitltd.spoiwo.excel

object SimplestReportGenerationTest extends AbstractReportGenerator {

  override def getWorkbook = Workbook(
    Sheet(
      name = "Test Sheet",
      rows = Row(Cell("Test string value", CellStyle.Default)) ::
      Row(Cell("Test string value2", CellStyle.Default)) ::
      Nil
    )
  )

}
