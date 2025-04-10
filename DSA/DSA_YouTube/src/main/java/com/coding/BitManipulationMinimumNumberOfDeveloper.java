package com.coding;

import java.util.*;

public class BitManipulationMinimumNumberOfDeveloper {
    static ArrayList<Integer> solution = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        HashMap<String, Integer> skillNumbering = new HashMap<>();
        skillNumbering.put("Java", 0);
        skillNumbering.put("nodeJs", 1);
        skillNumbering.put("ReactJs", 2);

        int noOfPeople = 3;
        int[] peopleSkill = new int[noOfPeople];
        //for first person
        int skillNum = skillNumbering.get("Java");
        peopleSkill[0] = peopleSkill[0] | (1 << skillNum);
        //for second person
        skillNum = skillNumbering.get("nodeJs");
        peopleSkill[1] = peopleSkill[1] | (1 << skillNum);
        //for Third person
        skillNum = skillNumbering.get("nodeJs");
        peopleSkill[2] = peopleSkill[2] | (1 << skillNum);
        skillNum = skillNumbering.get("ReactJs");
        peopleSkill[2] = peopleSkill[2] | (1 << skillNum);

        System.out.println("Convert in bits "+Arrays.toString(peopleSkill));

      solutionRecursiveCall(peopleSkill, n, 0, new ArrayList<>(), 0);
        System.out.println(solution);

    }

    public static void solutionRecursiveCall(int[] peopleSkill, int noOfSkills, int currentPersonIndex, ArrayList<Integer> oneSolution, int updatedSkillMasks){
        if(currentPersonIndex == peopleSkill.length){
            if(updatedSkillMasks == (1 << noOfSkills) - 1){// => This is the way of making 11111
                if(solution.size() == 0 || solution.size() > oneSolution.size()){
                    solution = new ArrayList<>(oneSolution);
                }
            }
            return;
        }
        System.out.println("No");
        solutionRecursiveCall(peopleSkill, noOfSkills, currentPersonIndex + 1, oneSolution, updatedSkillMasks);// No Case where it doesnt chose to come
        oneSolution.add(currentPersonIndex);
        System.out.println("Yes");
        solutionRecursiveCall(peopleSkill, noOfSkills, currentPersonIndex + 1, oneSolution, (updatedSkillMasks | peopleSkill[currentPersonIndex]));// Yes Case where it does come
        oneSolution.remove(oneSolution.size() - 1);
    }
}
