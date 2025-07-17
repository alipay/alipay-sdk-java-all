package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询数据服务结果
 *
 * @author auto create
 * @since 1.0, 2024-03-11 18:13:36
 */
public class AnttechMorseDataDataserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3574244772993415973L;

	/**
	 * 由摩斯同学配置并分配给调用方的服务对应标识号
	 */
	@ApiField("consult_id")
	private String consultId;

	/**
	 * mobile_sha256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	public String getConsultId() {
		return this.consultId;
	}
	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

}
