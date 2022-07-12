package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayOffOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.clearingcenter.payoff.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-28 09:59:20
 */
public class AlipayAccountClearingcenterPayoffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3565898971861431998L;

	/** 
	 * 待解付登记薄列表
	 */
	@ApiListField("pay_off_order_list")
	@ApiField("pay_off_order_v_o")
	private List<PayOffOrderVO> payOffOrderList;

	/** 
	 * EXECUTE_SUCCESS
UNKNOWN_EXCEPTION
DATABASE_EXCEPTION
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 处理成功
未知异常
数据库异常
	 */
	@ApiField("result_description")
	private String resultDescription;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setPayOffOrderList(List<PayOffOrderVO> payOffOrderList) {
		this.payOffOrderList = payOffOrderList;
	}
	public List<PayOffOrderVO> getPayOffOrderList( ) {
		return this.payOffOrderList;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
	public String getResultDescription( ) {
		return this.resultDescription;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
