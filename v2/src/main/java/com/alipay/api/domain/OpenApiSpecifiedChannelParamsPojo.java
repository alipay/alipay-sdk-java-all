package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户指定优先渠道扣款参数
 *
 * @author auto create
 * @since 1.0, 2023-09-04 14:01:15
 */
public class OpenApiSpecifiedChannelParamsPojo extends AlipayObject {

	private static final long serialVersionUID = 1647491499287526855L;

	/**
	 * 资产类型编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 机构描述
	 */
	@ApiField("inst_id")
	private String instId;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
