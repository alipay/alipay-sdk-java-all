package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻工作证相关图片信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 18:02:04
 */
public class ZmCardPictureInfo extends AlipayObject {

	private static final long serialVersionUID = 4449823395328745516L;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户上传的证书编号或者图片编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 图片存储id。可以通过开放接口【职得工作证图片上传】，即zhima.customer.jobworth.picture.upload获得
	 */
	@ApiField("picture_id")
	private String pictureId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPictureId() {
		return this.pictureId;
	}
	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}

}
