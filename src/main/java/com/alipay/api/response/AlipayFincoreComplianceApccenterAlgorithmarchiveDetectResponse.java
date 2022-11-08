package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.apccenter.algorithmarchive.detect response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 10:21:43
 */
public class AlipayFincoreComplianceApccenterAlgorithmarchiveDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633516177837874686L;

	/** 
	 * 是否允许跳过
	 */
	@ApiField("can_skip")
	private Boolean canSkip;

	/** 
	 * 是否禁用操作
	 */
	@ApiField("disable_operation")
	private Boolean disableOperation;

	/** 
	 * 编辑算法档案url地址
	 */
	@ApiField("edit_url")
	private String editUrl;

	/** 
	 * 是否需要完善
	 */
	@ApiField("has_perfect")
	private Boolean hasPerfect;

	/** 
	 * 平台算法唯一编码
	 */
	@ApiField("platform_algorithm_code")
	private String platformAlgorithmCode;

	/** 
	 * 平台算法来源
	 */
	@ApiField("platform_algorithm_source")
	private String platformAlgorithmSource;

	/** 
	 * 提醒文本div的html
	 */
	@ApiField("remind_text")
	private String remindText;

	/** 
	 * 查看算法档案url地址
	 */
	@ApiField("view_url")
	private String viewUrl;

	public void setCanSkip(Boolean canSkip) {
		this.canSkip = canSkip;
	}
	public Boolean getCanSkip( ) {
		return this.canSkip;
	}

	public void setDisableOperation(Boolean disableOperation) {
		this.disableOperation = disableOperation;
	}
	public Boolean getDisableOperation( ) {
		return this.disableOperation;
	}

	public void setEditUrl(String editUrl) {
		this.editUrl = editUrl;
	}
	public String getEditUrl( ) {
		return this.editUrl;
	}

	public void setHasPerfect(Boolean hasPerfect) {
		this.hasPerfect = hasPerfect;
	}
	public Boolean getHasPerfect( ) {
		return this.hasPerfect;
	}

	public void setPlatformAlgorithmCode(String platformAlgorithmCode) {
		this.platformAlgorithmCode = platformAlgorithmCode;
	}
	public String getPlatformAlgorithmCode( ) {
		return this.platformAlgorithmCode;
	}

	public void setPlatformAlgorithmSource(String platformAlgorithmSource) {
		this.platformAlgorithmSource = platformAlgorithmSource;
	}
	public String getPlatformAlgorithmSource( ) {
		return this.platformAlgorithmSource;
	}

	public void setRemindText(String remindText) {
		this.remindText = remindText;
	}
	public String getRemindText( ) {
		return this.remindText;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}
	public String getViewUrl( ) {
		return this.viewUrl;
	}

}
