package hayden.me.mccommand.command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.TimeCommand;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import java.util.Objects;
import java.util.Scanner;
import java.util.TimeZone;

import static java.lang.Math.random;


public class createcommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("modrequest").then(CommandManager.literal("create").executes(createcommand::createticket).then(CommandManager.literal("claim").executes(createcommand::claimticket)).then(CommandManager.literal("close").executes(createcommand::closeticket))));
    }

    private static int createticket(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        //Information gathered when User calls the create subcommand
        ServerPlayerEntity player = context.getSource().getPlayer();
        BlockPos playerpos = Objects.requireNonNull(context.getSource().getPlayer()).getBlockPos();
        ServerPlayerEntity playerID = (ServerPlayerEntity) context.getSource().getPlayerNames();
        long time = context.getSource().getPlayer().getLastActionTime();
        Text playerIDID = context.getSource().getPlayer().getDisplayName();
        int ticketnumber;
        ticketnumber = 1;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return 1;
    }
    private static int claimticket(CommandContext<ServerCommandSource> context){
        //admins to claim ticket to look into the issue further
        //We need a way to claim the ticket to either Kylie or Derek

        return 1;
    }
    private static int closeticket(CommandContext<ServerCommandSource> context){
        //admins close ticket once issue is resolved
        //We need a way for the ticket to be updated by the admins with closed status
        return 1;
    }

}

