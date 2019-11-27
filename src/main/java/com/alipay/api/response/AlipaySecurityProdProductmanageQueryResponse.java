package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VerifyProductUserStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.productmanage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 10:52:41
 */
public class AlipaySecurityProdProductmanageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6686617276762929224L;

	/** 
	 * 用户产品管理状态查询失败后返回的错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 用户产品管理状态查询失败后返回的错误原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 产品管理初始化是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 用户产品状态
	 */
	@ApiListField("user_prod_status")
	@ApiField("verify_product_user_status")
	private List<VerifyProductUserStatus> userProdStatus;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserProdStatus(List<VerifyProductUserStatus> userProdStatus) {
		this.userProdStatus = userProdStatus;
	}
	public List<VerifyProductUserStatus> getUserProdStatus( ) {
		return this.userProdStatus;
	}

}
