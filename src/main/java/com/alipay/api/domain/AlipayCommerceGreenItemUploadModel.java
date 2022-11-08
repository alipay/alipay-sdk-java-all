package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量上传能量码
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:27:45
 */
public class AlipayCommerceGreenItemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4527776247623326647L;

	/**
	 * 能量码归属的商户信息, 说明：

(1)如果该复杂对象不填，根据openAPI标准流程决定能量码归属方

-商户自研, 那么能量码归属方就是该商户. 

-第三方应用授权, 那么能量码归属方就是授权的商户. 参考https://opendocs.alipay.com/isv/10467/xldcyq

(2)如果填写，则认为能量码归属方就是merchant_pid对应的商户.
	 */
	@ApiField("belong_merchant_info")
	private BelongGreenMerchantInfo belongMerchantInfo;

	/**
	 * 指定数据上传操作类型，1: 插入，2: 删除
	 */
	@ApiField("data_operation")
	private Long dataOperation;

	/**
	 * 商品69码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 能量码列表，最多不能超过100条。
	 */
	@ApiListField("qr_code_list")
	@ApiField("string")
	private List<String> qrCodeList;

	/**
	 * 数据上传时间。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("upload_time")
	private Date uploadTime;

	public BelongGreenMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongGreenMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public Long getDataOperation() {
		return this.dataOperation;
	}
	public void setDataOperation(Long dataOperation) {
		this.dataOperation = dataOperation;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public List<String> getQrCodeList() {
		return this.qrCodeList;
	}
	public void setQrCodeList(List<String> qrCodeList) {
		this.qrCodeList = qrCodeList;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

}
