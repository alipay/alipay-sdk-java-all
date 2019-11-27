package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.shopsonicwave.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingToolShopsonicwaveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6417212476433348996L;

	/** 
	 * 表示店铺声音是否已经存在 如果是第一次从声波平台生成 exists为0; 否则为1
	 */
	@ApiField("exists")
	private String exists;

	/** 
	 * 声波id 与声波文件唯一对应
	 */
	@ApiField("sonic_id")
	private String sonicId;

	/** 
	 * 声波音频CDN文件
	 */
	@ApiField("sonic_path")
	private String sonicPath;

	public void setExists(String exists) {
		this.exists = exists;
	}
	public String getExists( ) {
		return this.exists;
	}

	public void setSonicId(String sonicId) {
		this.sonicId = sonicId;
	}
	public String getSonicId( ) {
		return this.sonicId;
	}

	public void setSonicPath(String sonicPath) {
		this.sonicPath = sonicPath;
	}
	public String getSonicPath( ) {
		return this.sonicPath;
	}

}
