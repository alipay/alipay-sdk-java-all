package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连解决方案单条数据提报结果查询
 *
 * @author auto create
 * @since 1.0, 2024-06-14 10:59:51
 */
public class AlipayMerchantSolutionRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3476278722848626849L;

	/**
	 * 要查询的数据，上传的数据可以标识唯一一条数据记录。如有多条记录，返回最新状态。
	 */
	@ApiListField("record_data")
	@ApiField("alipay_solution_record")
	private List<AlipaySolutionRecord> recordData;

	/**
	 * 标识唯一的解决方案
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public List<AlipaySolutionRecord> getRecordData() {
		return this.recordData;
	}
	public void setRecordData(List<AlipaySolutionRecord> recordData) {
		this.recordData = recordData;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
