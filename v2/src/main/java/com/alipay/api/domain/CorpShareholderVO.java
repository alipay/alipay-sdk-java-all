package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 股东信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CorpShareholderVO extends AlipayObject {

	private static final long serialVersionUID = 3595972473317223422L;

	/**
	 * 出资时间
	 */
	@ApiField("divestment_date")
	private Date divestmentDate;

	/**
	 * 入股时间
	 */
	@ApiField("shareholder_date")
	private Date shareholderDate;

	/**
	 * 股东名称
	 */
	@ApiField("shareholder_name")
	private String shareholderName;

	/**
	 * 持股列表
	 */
	@ApiListField("totals")
	@ApiField("corp_shareholder_total")
	private List<CorpShareholderTotal> totals;

	/**
	 * 转股时间
	 */
	@ApiField("transfer_date")
	private Date transferDate;

	public Date getDivestmentDate() {
		return this.divestmentDate;
	}
	public void setDivestmentDate(Date divestmentDate) {
		this.divestmentDate = divestmentDate;
	}

	public Date getShareholderDate() {
		return this.shareholderDate;
	}
	public void setShareholderDate(Date shareholderDate) {
		this.shareholderDate = shareholderDate;
	}

	public String getShareholderName() {
		return this.shareholderName;
	}
	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}

	public List<CorpShareholderTotal> getTotals() {
		return this.totals;
	}
	public void setTotals(List<CorpShareholderTotal> totals) {
		this.totals = totals;
	}

	public Date getTransferDate() {
		return this.transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

}
