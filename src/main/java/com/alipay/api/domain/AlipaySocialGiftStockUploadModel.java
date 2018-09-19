package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 送礼平台库存导入接口
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:23
 */
public class AlipaySocialGiftStockUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3446767181343514939L;

	/**
	 * 券码列表，商户体系内可兑换使用的券码(大小写不敏感)
	 */
	@ApiListField("entity_list")
	@ApiField("string")
	private List<String> entityList;

	/**
	 * 幂等号，请保持唯一, 如果重复则认为重复请求, 可以使用uuid生成或使用商户自己的单据号
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 对应送礼平台skuId，库存导入必须指定唯一的一个SKUID，该id需要送礼平台方先创建相应产品后，在通知使用方
	 */
	@ApiField("sku_id")
	private String skuId;

	public List<String> getEntityList() {
		return this.entityList;
	}
	public void setEntityList(List<String> entityList) {
		this.entityList = entityList;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
