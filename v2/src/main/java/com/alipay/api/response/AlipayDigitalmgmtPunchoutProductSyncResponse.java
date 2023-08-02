package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.punchout.product.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 11:11:53
 */
public class AlipayDigitalmgmtPunchoutProductSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2296386433478845345L;

	/** 
	 * 返回值信息
	 */
	@ApiListField("ret_value")
	@ApiField("string")
	private List<String> retValue;

	/** 
	 * 组合的异常信息
	 */
	@ApiField("sync_error_msg")
	private String syncErrorMsg;

	/** 
	 * false 时详见 ret_value 的同步异常产品
	 */
	@ApiField("sync_flag")
	private Boolean syncFlag;

	public void setRetValue(List<String> retValue) {
		this.retValue = retValue;
	}
	public List<String> getRetValue( ) {
		return this.retValue;
	}

	public void setSyncErrorMsg(String syncErrorMsg) {
		this.syncErrorMsg = syncErrorMsg;
	}
	public String getSyncErrorMsg( ) {
		return this.syncErrorMsg;
	}

	public void setSyncFlag(Boolean syncFlag) {
		this.syncFlag = syncFlag;
	}
	public Boolean getSyncFlag( ) {
		return this.syncFlag;
	}

}
