package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanAccountQueryDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.benefitaccount.loanaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 10:32:38
 */
public class AlipayMarketingBenefitaccountLoanaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531184359695179436L;

	/** 
	 * 流水列表
	 */
	@ApiListField("data_list")
	@ApiField("loan_account_query_detail_d_t_o")
	private List<LoanAccountQueryDetailDTO> dataList;

	/** 
	 * 下次检索传递时间;'2025-08-13 10:00:00'的格式为'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("next_end_time")
	private String nextEndTime;

	/** 
	 * 分页时若有下一页，则会有nextOrderNo，放入下一次请求中
	 */
	@ApiField("next_order_no")
	private String nextOrderNo;

	public void setDataList(List<LoanAccountQueryDetailDTO> dataList) {
		this.dataList = dataList;
	}
	public List<LoanAccountQueryDetailDTO> getDataList( ) {
		return this.dataList;
	}

	public void setNextEndTime(String nextEndTime) {
		this.nextEndTime = nextEndTime;
	}
	public String getNextEndTime( ) {
		return this.nextEndTime;
	}

	public void setNextOrderNo(String nextOrderNo) {
		this.nextOrderNo = nextOrderNo;
	}
	public String getNextOrderNo( ) {
		return this.nextOrderNo;
	}

}
