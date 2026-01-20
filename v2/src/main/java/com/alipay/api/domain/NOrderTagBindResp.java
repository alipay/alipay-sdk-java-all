package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料绑定点位时所需要的物料参数
 *
 * @author auto create
 * @since 1.0, 2025-07-30 03:11:18
 */
public class NOrderTagBindResp extends AlipayObject {

	private static final long serialVersionUID = 1468746161685949931L;

	/**
	 * 服务商调用接口绑定点位和物料关系时的现场作业图片
	 */
	@ApiListField("bind_pic")
	@ApiField("string")
	private List<String> bindPic;

	/**
	 * 需要绑定点位的碰一下链接
	 */
	@ApiListField("nfc_url")
	@ApiField("string")
	private List<String> nfcUrl;

	public List<String> getBindPic() {
		return this.bindPic;
	}
	public void setBindPic(List<String> bindPic) {
		this.bindPic = bindPic;
	}

	public List<String> getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(List<String> nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

}
