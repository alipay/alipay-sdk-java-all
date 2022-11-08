package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepayRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.repaymentdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:58
 */
public class MybankCreditSupplychainWfRepaymentdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2681467518275632538L;

	/** 
	 * 当前页码
	 */
	@ApiField("pageindex")
	private Long pageindex;

	/** 
	 * 每页数量
	 */
	@ApiField("pagesize")
	private Long pagesize;

	/** 
	 * 还款明细
	 */
	@ApiListField("repayrecord")
	@ApiField("repay_record_v_o")
	private List<RepayRecordVO> repayrecord;

	/** 
	 * 总数量
	 */
	@ApiField("totalnums")
	private Long totalnums;

	public void setPageindex(Long pageindex) {
		this.pageindex = pageindex;
	}
	public Long getPageindex( ) {
		return this.pageindex;
	}

	public void setPagesize(Long pagesize) {
		this.pagesize = pagesize;
	}
	public Long getPagesize( ) {
		return this.pagesize;
	}

	public void setRepayrecord(List<RepayRecordVO> repayrecord) {
		this.repayrecord = repayrecord;
	}
	public List<RepayRecordVO> getRepayrecord( ) {
		return this.repayrecord;
	}

	public void setTotalnums(Long totalnums) {
		this.totalnums = totalnums;
	}
	public Long getTotalnums( ) {
		return this.totalnums;
	}

}
