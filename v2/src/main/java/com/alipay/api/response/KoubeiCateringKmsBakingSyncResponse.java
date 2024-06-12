package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kms.baking.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:14:03
 */
public class KoubeiCateringKmsBakingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5611846757991298322L;

	/** 
	 * 核对提示信息
	 */
	@ApiField("check_msg")
	private String checkMsg;

	/** 
	 * 核对专用字段，核对通过:true
核对未通过:false
	 */
	@ApiField("check_pass")
	private Boolean checkPass;

	/** 
	 * 平台统计已同步数据量
	 */
	@ApiField("sync_count")
	private Long syncCount;

	public void setCheckMsg(String checkMsg) {
		this.checkMsg = checkMsg;
	}
	public String getCheckMsg( ) {
		return this.checkMsg;
	}

	public void setCheckPass(Boolean checkPass) {
		this.checkPass = checkPass;
	}
	public Boolean getCheckPass( ) {
		return this.checkPass;
	}

	public void setSyncCount(Long syncCount) {
		this.syncCount = syncCount;
	}
	public Long getSyncCount( ) {
		return this.syncCount;
	}

}
