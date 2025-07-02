package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料绑定点位时所需要的物料参数
 *
 * @author auto create
 * @since 1.0, 2025-06-10 19:24:54
 */
public class NOrderTagBindResp extends AlipayObject {

	private static final long serialVersionUID = 8399413727615963673L;

	/**
	 * 需要绑定点位的碰一下链接
	 */
	@ApiListField("nfc_url")
	@ApiField("string")
	private List<String> nfcUrl;

	public List<String> getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(List<String> nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

}
