package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品信息
 *
 * @author auto create
 * @since 1.0, 2025-12-25 14:16:46
 */
public class PolicyProdInfoModel extends AlipayObject {

	private static final long serialVersionUID = 7568384151155523216L;

	/**
	 * 责任剩余保额列表
	 */
	@ApiListField("duty_residue_amount_list")
	@ApiField("duty_residue_amount")
	private List<DutyResidueAmount> dutyResidueAmountList;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品编号
	 */
	@ApiField("prod_no")
	private String prodNo;

	public List<DutyResidueAmount> getDutyResidueAmountList() {
		return this.dutyResidueAmountList;
	}
	public void setDutyResidueAmountList(List<DutyResidueAmount> dutyResidueAmountList) {
		this.dutyResidueAmountList = dutyResidueAmountList;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

}
