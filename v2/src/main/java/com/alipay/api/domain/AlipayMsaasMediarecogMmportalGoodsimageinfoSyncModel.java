package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品展示图信息同步
 *
 * @author auto create
 * @since 1.0, 2026-05-12 10:16:46
 */
public class AlipayMsaasMediarecogMmportalGoodsimageinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6616732829281993691L;

	/**
	 * 对应商品主外观算法ID
	 */
	@ApiField("algorithm_id")
	private String algorithmId;

	/**
	 * 展示图信息
	 */
	@ApiListField("img_infos")
	@ApiField("goods_image_info")
	private List<GoodsImageInfo> imgInfos;

	public String getAlgorithmId() {
		return this.algorithmId;
	}
	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

	public List<GoodsImageInfo> getImgInfos() {
		return this.imgInfos;
	}
	public void setImgInfos(List<GoodsImageInfo> imgInfos) {
		this.imgInfos = imgInfos;
	}

}
