package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户指定优先渠道扣款参数
 *
 * @author auto create
 * @since 1.0, 2024-02-20 16:14:47
 */
public class OpenApiSpecifiedChannelParamsPojo extends AlipayObject {

	private static final long serialVersionUID = 7467423743286587157L;

	/**
	 * 资产类型编码，具体传参值请联系技术进行分配。
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
