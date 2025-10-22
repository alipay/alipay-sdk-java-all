package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下展码数据模型
 *
 * @author auto create
 * @since 1.0, 2025-04-17 15:10:52
 */
public class NppShowQrCodeDataDTO extends AlipayObject {

	private static final long serialVersionUID = 5281342179613482724L;

	/**
	 * 地址描述
	 */
	@ApiField("address_des")
	private String addressDes;

	/**
	 * 商品描述
	 */
	@ApiField("goods_des")
	private String goodsDes;

	/**
	 * 海报
	 */
	@ApiField("placard_url")
	private String placardUrl;

	/**
	 * 展码信息
	 */
	@ApiListField("qr_code_list")
	@ApiField("npp_qr_code_d_t_o")
	private List<NppQrCodeDTO> qrCodeList;

	/**
	 * 时间描述
	 */
	@ApiField("time_des")
	private String timeDes;

	public String getAddressDes() {
		return this.addressDes;
	}
	public void setAddressDes(String addressDes) {
		this.addressDes = addressDes;
	}

	public String getGoodsDes() {
		return this.goodsDes;
	}
	public void setGoodsDes(String goodsDes) {
		this.goodsDes = goodsDes;
	}

	public String getPlacardUrl() {
		return this.placardUrl;
	}
	public void setPlacardUrl(String placardUrl) {
		this.placardUrl = placardUrl;
	}

	public List<NppQrCodeDTO> getQrCodeList() {
		return this.qrCodeList;
	}
	public void setQrCodeList(List<NppQrCodeDTO> qrCodeList) {
		this.qrCodeList = qrCodeList;
	}

	public String getTimeDes() {
		return this.timeDes;
	}
	public void setTimeDes(String timeDes) {
		this.timeDes = timeDes;
	}

}
