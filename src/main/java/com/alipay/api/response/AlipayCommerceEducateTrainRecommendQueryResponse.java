package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CateInfoVO;
import com.alipay.api.domain.ItemInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-19 20:13:27
 */
public class AlipayCommerceEducateTrainRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2193448974853767496L;

	/** 
	 * 根据年龄推荐的学段
	 */
	@ApiField("default_first_cate")
	private CateInfoVO defaultFirstCate;

	/** 
	 * 是否有更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 推荐元素列表
	 */
	@ApiListField("item_infos")
	@ApiField("item_info_v_o")
	private List<ItemInfoVO> itemInfos;

	/** 
	 * 外部场景传入的学段
	 */
	@ApiField("selected_first_cate")
	private CateInfoVO selectedFirstCate;

	public void setDefaultFirstCate(CateInfoVO defaultFirstCate) {
		this.defaultFirstCate = defaultFirstCate;
	}
	public CateInfoVO getDefaultFirstCate( ) {
		return this.defaultFirstCate;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setItemInfos(List<ItemInfoVO> itemInfos) {
		this.itemInfos = itemInfos;
	}
	public List<ItemInfoVO> getItemInfos( ) {
		return this.itemInfos;
	}

	public void setSelectedFirstCate(CateInfoVO selectedFirstCate) {
		this.selectedFirstCate = selectedFirstCate;
	}
	public CateInfoVO getSelectedFirstCate( ) {
		return this.selectedFirstCate;
	}

}
