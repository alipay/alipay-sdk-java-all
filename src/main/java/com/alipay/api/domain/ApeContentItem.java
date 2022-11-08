package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容数据的结构
 *
 * @author auto create
 * @since 1.0, 2022-10-14 12:00:21
 */
public class ApeContentItem extends AlipayObject {

	private static final long serialVersionUID = 6291526374778767389L;

	/**
	 * 作者粉丝数
	 */
	@ApiField("author_fans")
	private Long authorFans;

	/**
	 * 作者ID
	 */
	@ApiField("author_id")
	private String authorId;

	/**
	 * 作者评级
	 */
	@ApiField("author_level")
	private String authorLevel;

	/**
	 * 作者名
	 */
	@ApiField("author_name")
	private String authorName;

	/**
	 * 内容的类目
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 内容类目的层级数
	 */
	@ApiField("cate_cnt")
	private Long cateCnt;

	/**
	 * 内容累计收藏数
	 */
	@ApiField("collect_cnt")
	private Long collectCnt;

	/**
	 * 所属话题id
	 */
	@ApiField("collection")
	private String collection;

	/**
	 * 内容累计评论次数
	 */
	@ApiField("comment_cnt")
	private Long commentCnt;

	/**
	 * 数据的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容失效时间
	 */
	@ApiField("copyright_end")
	private String copyrightEnd;

	/**
	 * 内容生效时间
	 */
	@ApiField("copyright_start")
	private String copyrightStart;

	/**
	 * 创建时间 单位为毫秒
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 物品价格 小数点后两位
	 */
	@ApiField("current_price")
	private String currentPrice;

	/**
	 * 详情页中图片的数量
	 */
	@ApiField("detail_pic_num")
	private Long detailPicNum;

	/**
	 * 内容过期时间戳，精确到毫秒
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 内容的唯一ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 关键字
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 地域tag
	 */
	@ApiField("location_tag")
	private String locationTag;

	/**
	 * 商品归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 可选	图片url，如果多张图，头图放在前面，使用$##$链接多个url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 内容累计分享数量
	 */
	@ApiField("praise_cnt")
	private Long praiseCnt;

	/**
	 * 精确到毫秒，如1520327038000
	 */
	@ApiField("pub_time")
	private String pubTime;

	/**
	 * 内容评分
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 相关商品id，多个使用$##$来区分
	 */
	@ApiField("related_goods_ids")
	private String relatedGoodsIds;

	/**
	 * 数据类型
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 内容累计分享次数
	 */
	@ApiField("share_cnt")
	private Long shareCnt;

	/**
	 * 内容来源类型，如自然up主
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 状态 1为有效 0为无效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 内容标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 所属话题tag
	 */
	@ApiField("topic_tag")
	private String topicTag;

	/**
	 * 内容的类别
	 */
	@ApiField("type")
	private String type;

	/**
	 * 内容信息更新时间戳，精确到毫秒，如1520327038000
	 */
	@ApiField("update_time")
	private String updateTime;

	/**
	 * 视频时长 单位为毫秒
	 */
	@ApiField("video_duration")
	private String videoDuration;

	/**
	 * 可选	视频url。如果有多个，使用$##$链接多个url
	 */
	@ApiField("video_url")
	private String videoUrl;

	public Long getAuthorFans() {
		return this.authorFans;
	}
	public void setAuthorFans(Long authorFans) {
		this.authorFans = authorFans;
	}

	public String getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorLevel() {
		return this.authorLevel;
	}
	public void setAuthorLevel(String authorLevel) {
		this.authorLevel = authorLevel;
	}

	public String getAuthorName() {
		return this.authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCate() {
		return this.cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

	public Long getCateCnt() {
		return this.cateCnt;
	}
	public void setCateCnt(Long cateCnt) {
		this.cateCnt = cateCnt;
	}

	public Long getCollectCnt() {
		return this.collectCnt;
	}
	public void setCollectCnt(Long collectCnt) {
		this.collectCnt = collectCnt;
	}

	public String getCollection() {
		return this.collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}

	public Long getCommentCnt() {
		return this.commentCnt;
	}
	public void setCommentCnt(Long commentCnt) {
		this.commentCnt = commentCnt;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCopyrightEnd() {
		return this.copyrightEnd;
	}
	public void setCopyrightEnd(String copyrightEnd) {
		this.copyrightEnd = copyrightEnd;
	}

	public String getCopyrightStart() {
		return this.copyrightStart;
	}
	public void setCopyrightStart(String copyrightStart) {
		this.copyrightStart = copyrightStart;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Long getDetailPicNum() {
		return this.detailPicNum;
	}
	public void setDetailPicNum(Long detailPicNum) {
		this.detailPicNum = detailPicNum;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getLocationTag() {
		return this.locationTag;
	}
	public void setLocationTag(String locationTag) {
		this.locationTag = locationTag;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Long getPraiseCnt() {
		return this.praiseCnt;
	}
	public void setPraiseCnt(Long praiseCnt) {
		this.praiseCnt = praiseCnt;
	}

	public String getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRelatedGoodsIds() {
		return this.relatedGoodsIds;
	}
	public void setRelatedGoodsIds(String relatedGoodsIds) {
		this.relatedGoodsIds = relatedGoodsIds;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public Long getShareCnt() {
		return this.shareCnt;
	}
	public void setShareCnt(Long shareCnt) {
		this.shareCnt = shareCnt;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopicTag() {
		return this.topicTag;
	}
	public void setTopicTag(String topicTag) {
		this.topicTag = topicTag;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getVideoDuration() {
		return this.videoDuration;
	}
	public void setVideoDuration(String videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
