package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目维度内容资讯文章个性化推荐查询
 *
 * @author auto create
 * @since 1.0, 2022-12-12 14:09:55
 */
public class AlipayOpenCategoryArticleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2493135926675596352L;

	/**
	 * ID  类目名称
WEB001  运动迷
WEB002  娱乐
WEB003  游戏
WEB004  看大片
WEB005  爱美丽
WEB006  车参考
WEB007  星座
WEB008  养娃经
WEB009  美食家
WEB010  玩出游
WEB011  科技圈
WEB012  潮数码
WEB013  财知道
WEB014  彩票
WEB016  职场
WEB999  其他
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
