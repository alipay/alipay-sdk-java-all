package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 表格一行内容
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:04:10
 */
public class AiOcrTableRow extends AlipayObject {

	private static final long serialVersionUID = 4852828412759975639L;

	/**
	 * table一行的内容
	 */
	@ApiListField("row")
	@ApiField("ai_ocr_table_context")
	private List<AiOcrTableContext> row;

	public List<AiOcrTableContext> getRow() {
		return this.row;
	}
	public void setRow(List<AiOcrTableContext> row) {
		this.row = row;
	}

}
