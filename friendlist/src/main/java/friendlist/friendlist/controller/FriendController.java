package friendlist.friendlist.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import friendlist.friendlist.domain.Friend;

@Controller
public class FriendController {
    ArrayList<Friend> friendList = new ArrayList<>();
    Friend friend1 = new Friend("Minna", "Pellikka");
    Friend friend2 = new Friend("Tanja", "Bergius");
    Friend friend3 = new Friend("Jukka", "Justin");

    public FriendController() {
        friendList.add(friend1);
        friendList.add(friend2);
        friendList.add(friend3);
    }

    @GetMapping("/friend-list")
    public String showFriend(Model model) {

        model.addAttribute("friend", friendList);

        return "friend-list";

    }

    @GetMapping("/add")
    public String addFriend(Model model) {
        Friend friend = new Friend();
        model.addAttribute("friend", friend);
        return "add-friend";
    }

    @PostMapping("/save")
    public String saveFriend(@ModelAttribute Friend friend) {
        friendList.add(friend);
        return "redirect:/friend-list";
    }

}
