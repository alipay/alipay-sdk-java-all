package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阅读听书频道书籍信息同步接口
 *
 * @author auto create
 * @since 1.0, 2023-08-18 16:20:17
 */
public class AlipayUserAntbookcontentBookSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6223788242497991853L;

	/**
	 * 作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 书籍是否已完结
	 */
	@ApiField("book_finished")
	private Boolean bookFinished;

	/**
	 * 书籍是否免费
	 */
	@ApiField("book_free")
	private Boolean bookFree;

	/**
	 * 外部书籍ID，可唯一标识一本书
	 */
	@ApiField("book_id")
	private String bookId;

	/**
	 * 书籍简介，限制500个字符
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 书籍类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 版权类型
	 */
	@ApiField("copyright_type")
	private String copyrightType;

	/**
	 * 封面原图
	 */
	@ApiField("cover_url")
	private String coverUrl;

	/**
	 * 书籍创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 目前人群标签
	 */
	@ApiListField("crowd_tag_list")
	@ApiField("string")
	private List<String> crowdTagList;

	/**
	 * 书籍名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * ADD：新增书籍信息
UPDATE：书籍信息变更
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 书籍热度信息，有则传入
	 */
	@ApiField("popularity_info")
	private BookPopularityInfo popularityInfo;

	/**
	 * 书籍价格信息，收费书籍必填
	 */
	@ApiField("price_info")
	private BookPriceInfo priceInfo;

	/**
	 * 专辑营销活动信息，有则传入
	 */
	@ApiField("promo_info")
	private BookPromoInfo promoInfo;

	/**
	 * 推荐理由
	 */
	@ApiField("recommend_reason")
	private String recommendReason;

	/**
	 * 目标场景列表
	 */
	@ApiListField("scene_list")
	@ApiField("string")
	private List<String> sceneList;

	/**
	 * 章节数量
	 */
	@ApiField("sum_chapters")
	private Long sumChapters;

	/**
	 * 书籍总字数
	 */
	@ApiField("sum_words")
	private Long sumWords;

	/**
	 * 书籍标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 书籍更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean getBookFinished() {
		return this.bookFinished;
	}
	public void setBookFinished(Boolean bookFinished) {
		this.bookFinished = bookFinished;
	}

	public Boolean getBookFree() {
		return this.bookFree;
	}
	public void setBookFree(Boolean bookFree) {
		this.bookFree = bookFree;
	}

	public String getBookId() {
		return this.bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBrief() {
		return this.brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCopyrightType() {
		return this.copyrightType;
	}
	public void setCopyrightType(String copyrightType) {
		this.copyrightType = copyrightType;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<String> getCrowdTagList() {
		return this.crowdTagList;
	}
	public void setCrowdTagList(List<String> crowdTagList) {
		this.crowdTagList = crowdTagList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public BookPopularityInfo getPopularityInfo() {
		return this.popularityInfo;
	}
	public void setPopularityInfo(BookPopularityInfo popularityInfo) {
		this.popularityInfo = popularityInfo;
	}

	public BookPriceInfo getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(BookPriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public BookPromoInfo getPromoInfo() {
		return this.promoInfo;
	}
	public void setPromoInfo(BookPromoInfo promoInfo) {
		this.promoInfo = promoInfo;
	}

	public String getRecommendReason() {
		return this.recommendReason;
	}
	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public List<String> getSceneList() {
		return this.sceneList;
	}
	public void setSceneList(List<String> sceneList) {
		this.sceneList = sceneList;
	}

	public Long getSumChapters() {
		return this.sumChapters;
	}
	public void setSumChapters(Long sumChapters) {
		this.sumChapters = sumChapters;
	}

	public Long getSumWords() {
		return this.sumWords;
	}
	public void setSumWords(Long sumWords) {
		this.sumWords = sumWords;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
