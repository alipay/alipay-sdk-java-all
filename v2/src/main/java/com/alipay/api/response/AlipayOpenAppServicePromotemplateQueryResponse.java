package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoAccessBaseCatalogVO;
import com.alipay.api.domain.PromoContentApiSchemaVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promotemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:07:58
 */
public class AlipayOpenAppServicePromotemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516447444152376492L;

	/** 
	 * 展台准入类目列表
	 */
	@ApiListField("promo_access_catalog_vos")
	@ApiField("promo_access_base_catalog_v_o")
	private List<PromoAccessBaseCatalogVO> promoAccessCatalogVos;

	/** 
	 * 展台的描述信息
	 */
	@ApiField("promo_booth_desc")
	private String promoBoothDesc;

	/** 
	 * https://opendocs.alipay.com/mini/operation/as2i2u#FAQ
	 */
	@ApiField("promo_booth_desc_url")
	private String promoBoothDescUrl;

	/** 
	 * 展台允许的实体数量类型；
SINGLE_SERVICE("SINGLE_SERVICE", "单个服务"),
MULTI_SERVICE_OF_ONE_CAT("MULTI_SERVICE_OF_ONE_CAT", "同类目下多个服务")
	 */
	@ApiField("promo_booth_entity_num_type")
	private String promoBoothEntityNumType;

	/** 
	 * 展台允许的实体数量类型。枚举值如下：
STD_SERVICE("STD_SERVICE", "标准化服务"),
MINI_APP("MINI_APP", "小程序"),
	 */
	@ApiField("promo_booth_entity_type")
	private String promoBoothEntityType;

	/** 
	 * 展台ID
	 */
	@ApiField("promo_booth_id")
	private String promoBoothId;

	/** 
	 * 展台名称
	 */
	@ApiField("promo_booth_name")
	private String promoBoothName;

	/** 
	 * 内容schema
	 */
	@ApiListField("promo_content_api_schema_vos")
	@ApiField("promo_content_api_schema_v_o")
	private List<PromoContentApiSchemaVO> promoContentApiSchemaVos;

	public void setPromoAccessCatalogVos(List<PromoAccessBaseCatalogVO> promoAccessCatalogVos) {
		this.promoAccessCatalogVos = promoAccessCatalogVos;
	}
	public List<PromoAccessBaseCatalogVO> getPromoAccessCatalogVos( ) {
		return this.promoAccessCatalogVos;
	}

	public void setPromoBoothDesc(String promoBoothDesc) {
		this.promoBoothDesc = promoBoothDesc;
	}
	public String getPromoBoothDesc( ) {
		return this.promoBoothDesc;
	}

	public void setPromoBoothDescUrl(String promoBoothDescUrl) {
		this.promoBoothDescUrl = promoBoothDescUrl;
	}
	public String getPromoBoothDescUrl( ) {
		return this.promoBoothDescUrl;
	}

	public void setPromoBoothEntityNumType(String promoBoothEntityNumType) {
		this.promoBoothEntityNumType = promoBoothEntityNumType;
	}
	public String getPromoBoothEntityNumType( ) {
		return this.promoBoothEntityNumType;
	}

	public void setPromoBoothEntityType(String promoBoothEntityType) {
		this.promoBoothEntityType = promoBoothEntityType;
	}
	public String getPromoBoothEntityType( ) {
		return this.promoBoothEntityType;
	}

	public void setPromoBoothId(String promoBoothId) {
		this.promoBoothId = promoBoothId;
	}
	public String getPromoBoothId( ) {
		return this.promoBoothId;
	}

	public void setPromoBoothName(String promoBoothName) {
		this.promoBoothName = promoBoothName;
	}
	public String getPromoBoothName( ) {
		return this.promoBoothName;
	}

	public void setPromoContentApiSchemaVos(List<PromoContentApiSchemaVO> promoContentApiSchemaVos) {
		this.promoContentApiSchemaVos = promoContentApiSchemaVos;
	}
	public List<PromoContentApiSchemaVO> getPromoContentApiSchemaVos( ) {
		return this.promoContentApiSchemaVos;
	}

}
