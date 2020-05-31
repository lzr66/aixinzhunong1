package Controller;

import Database.database;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.JsonTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.footprint;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("/announcement")
public class announcementController {
    JSONObject jsonObject= new JSONObject();
    @GetMapping("/select")
    public String selectAllannouncement() throws SQLException {
        ResultSet resultSet= database.selectAllannouncement();
        JsonTool jsonTool= new JsonTool();
        String json=jsonTool.resultSetToJson(resultSet);
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("data",json);
        return  jsonObject.toJSONString();
    }

    @GetMapping("/put")
    public  String insertAnnouncement(@RequestParam String footId,
                                      @RequestParam String userId,
                                      @RequestParam String goodId,
                                      @RequestParam Date timestamp )
    {
        footprint footprint =new footprint();
        footprint.setFootId(footId);
        footprint.setGoodId(goodId);
        footprint.setUserId(userId);
        footprint.setTimestamp(timestamp);
        database.generateFootprint(footprint);
        jsonObject.put("code",200);
        return jsonObject.toJSONString();

    }

}
