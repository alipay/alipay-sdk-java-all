package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FdsPayFundItemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.fund.witness.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-30 15:11:24
 */
public class AlipayFincoreFunddsFundWitnessWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 6121528794328432658L;

	/** 
	 * fundds订单号
	 */
	@ApiField("fds_no")
	private String fdsNo;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 支付条目列表
	 */
	@ApiListField("pay_fund_item_list")
	@ApiField("fds_pay_fund_item_d_t_o")
	private List<FdsPayFundItemDTO> payFundItemList;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setFdsNo(String fdsNo) {
		this.fdsNo = fdsNo;
	}
	public String getFdsNo( ) {
		return this.fdsNo;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPayFundItemList(List<FdsPayFundItemDTO> payFundItemList) {
		this.payFundItemList = payFundItemList;
	}
	public List<FdsPayFundItemDTO> getPayFundItemList( ) {
		return this.payFundItemList;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
